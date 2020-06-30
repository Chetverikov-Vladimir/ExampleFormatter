package che.vlvl.concepts;

class TwitterUsernameConcept implements Concept {
    public String wrapText(String plainText) {
        String twitterLink="http://twitter.com/";
        String twitterName=plainText.replaceFirst("@","");
        StringBuilder result=new StringBuilder();

        //@elversatile -> @<a href= "http://twitter.com/elversatile">elversatile</a>
        result.append("@<a href=\"")
                .append(twitterLink)
                .append(twitterName)
                .append(">")
                .append(twitterName)
                .append("</a>");

        return result.toString();
    }
}
