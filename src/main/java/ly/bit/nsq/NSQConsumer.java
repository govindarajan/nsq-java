package ly.bit.nsq;

public class NSQConsumer extends NSQReader {
    
    public NSQConsumer(String topic, String channel) {
        super();
        this.init(topic, channel);
    }
    
    public NSQConsumer(String host, String topic, String channel) {
        super();
        this.init(host, topic, channel);
    }

    @Override
    protected Runnable makeRunnableFromMessage(Message msg) {
        // TODO Auto-generated method stub
        System.out.println("Message: " + msg.toString());
        return null;
    }

}
