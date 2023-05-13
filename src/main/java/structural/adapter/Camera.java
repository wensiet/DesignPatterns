package structural.adapter;

import item.Item;

public class Camera extends Item implements MultiRecorder {
    @Override
    public void recordAudio() {
        System.out.println("Camera is recording audio!");
    }

    @Override
    public void recordVideo() {
        System.out.println("Camera is recording video!");
    }
}
