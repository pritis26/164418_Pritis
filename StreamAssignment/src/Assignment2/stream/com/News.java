package Assignment2.stream.com;

public class News {
int newsid;
String postedByUser,CommentByUser,comment;
public News(int newsid, String postedByUser, String commentByUser,
		String comment) {
	super();
	this.newsid = newsid;
	this.postedByUser = postedByUser;
	CommentByUser = commentByUser;
	this.comment = comment;
}
@Override
public String toString() {
	return "News [newsid=" + newsid + ", postedByUser=" + postedByUser
			+ ", CommentByUser=" + CommentByUser + ", comment=" + comment + "]";
}
public int getNewsid() {
	return newsid;
}
public void setNewsid(int newsid) {
	this.newsid = newsid;
}
public String getPostedByUser() {
	return postedByUser;
}
public void setPostedByUser(String postedByUser) {
	this.postedByUser = postedByUser;
}
public String getCommentByUser() {
	return CommentByUser;
}
public void setCommentByUser(String commentByUser) {
	CommentByUser = commentByUser;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}

}
