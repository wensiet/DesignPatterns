package structural.adapter;

import item.Item;

public class Dictaphone extends Item implements VoiceRecorder {
    @Override
    public void record() {
        System.out.println("Dictaphone is recording audio!");
    }
}
