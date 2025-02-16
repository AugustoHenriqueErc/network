
/**
 * Escreva uma descrição da classe EventPost aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class EventPost extends Post
{
    private String event;
    /**
     * Construtor para objetos da classe EventPost
     */
    public EventPost(String author, String event)
    {
        super(author); 
        this.event = event;
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(event);
        return sb.toString();
    }
    
}
