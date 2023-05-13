package structural.adapter;

public class MultiRecorderAdapter implements VoiceRecorder{
    private final MultiRecorder multiRecorder;
    public MultiRecorderAdapter(MultiRecorder multiRecorder){
        this.multiRecorder = multiRecorder;
    }

    @Override
    public void record() {
        multiRecorder.recordAudio();
        multiRecorder.recordVideo();
    }
}
