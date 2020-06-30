package che.vlvl.concepts;

class EntityConcept implements Concept {
    public String wrapText(String plainText) {
        return "<strong>"+plainText+"</strong>";
    }
}
