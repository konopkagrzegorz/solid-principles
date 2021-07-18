package com.epam.prejap.isp.example2;

public class SmartPhone extends Phone implements Camera {

    private Phone phone;
    private Camera camera;
    private Messageable messageable;

    public SmartPhone(Phone phone, Camera camera, Messageable messageable) {
        this.phone = phone;
        this.camera = camera;
        this.messageable = messageable;
    }

    @Override
    public void makeCall() {
        phone.makeCall();
    }

    @Override
    public void takePhoto() {
        camera.takePhoto();
    }

    @Override
    public void sendMessage(String text) {
        phone.sendMessage(text);
    }
}
