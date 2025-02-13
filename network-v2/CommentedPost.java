import java.util.ArrayList;

/**
 * Escreva uma descrição da classe CommentedPost aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class CommentedPost extends Post
{
    private int likes;
    private ArrayList<String> comments;
    
    public CommentedPost(String author)
    {
        super(author);
        likes = 0;
        comments = new ArrayList<>();
    }
    
    /**
     * Record that a user has liked the post.
     */
    public void like()
    {
        likes++;
    }
    
    /**
     * Record that a user has withdrawn his/her 'Like' vote.
     */
    public void unlike()
    {
        if (likes > 0) {
            likes--;
        }
    }
    
    protected String getLikes()
    {
        String likeString;
        if(likes > 0)likeString= "  -  " + likes + " people like this.";
        else likeString = " ";
        return likeString;
    }
    
    /**
     * Add a comment to this post.
     * 
     * @param text  The new comment to add.
     */
    public void addComment(String text)
    {
        comments.add(text);
    }
    
    protected String getComments()
    {
        String commentString;
        if(comments.isEmpty())commentString = "   No comments.";
        else commentString = "   " + comments.size() + " comment(s). Click here to view.";
        return commentString;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append(getUserName()+ "\n");
        sb.append(getLikes()+ "\n");
        sb.append(getComments()+ "\n");
        
        return sb.toString();
    }
}
