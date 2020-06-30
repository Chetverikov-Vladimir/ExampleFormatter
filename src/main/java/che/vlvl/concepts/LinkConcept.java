package che.vlvl.concepts;

class LinkConcept implements Concept {
    public String wrapText(String plainText) {
        StringBuilder result=new StringBuilder();

        //http://bit.ly/xyz -> <a href="http://bit.ly/xyz">http://bit.ly/xyz</a>
        result.append("@<a href=\"")
                .append(plainText)
                .append("\">")
                .append(plainText)
                .append("</a>");

        return result.toString();
    }
}
