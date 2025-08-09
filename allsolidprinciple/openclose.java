package wiprofirst.allsolidprinciple;

interface Notification{
	void send();
}
class EmailNotification implements Notification {

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("Receving Email");
		
	}
	
}
class SmsNotification implements Notification {

	@Override
	public void send() {
		// TODO Auto-generated method stub
		
		System.out.println("receiving SMS");
		
	}
	
}
 class NotificationService{
	void notifyuser(Notification notify) {
		notify.send();
	}
}
public class openclose {
public static void main(String[] args) {
	NotificationService service = new NotificationService();
	service.notifyuser(new SmsNotification());
}
}
