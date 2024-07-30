package proxies;

import model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary가 없다면 NoUniqueBeanDefinitionException 이 발생한다.
@Primary
public class CommentPushNotificationProxy
        implements CommentNotificationProxy {

  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending push notification for comment: " + comment.getText());
  }
}
