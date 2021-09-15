package datastructure;

public class Fortune {
    public String mytext;
    public String speaker;
    public String source;

    public Fortune() {
        mytext = "";
        speaker = "";
        source = new String();
    }

    public Fortune(String m, String s, String s2) {
        this.mytext = m;
        this.speaker = s;
        this.source = s2;
    }

    /* input look like: A little suffering is good for the soul.
    -- Kirk, "The Corbomite Maneuver", stardate 1514.0 */

    public Fortune (String input) {

    }

    public String getText(){
        return mytext;
    }

    public void setText(String t) {
        mytext = t;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
