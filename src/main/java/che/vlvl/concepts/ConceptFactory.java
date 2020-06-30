package che.vlvl.concepts;

public class ConceptFactory {
    public Concept getWrapper(ConceptTypes conceptType) {

        if (conceptType == null) throw new IllegalArgumentException("Concept type is missing:" + conceptType);
        Concept result = null;

        switch (conceptType) {
            case PLAIN_TEXT:
                result = new PlainTextConcept();
                break;
            case LINK:
                result = new LinkConcept();
                break;
            case ENTITY:
                result = new EntityConcept();
                break;
            case TWITTER_USERNAME:
                result = new TwitterUsernameConcept();
                break;
            default:
                throw new IllegalArgumentException("Wrong concept type:" + conceptType);
        }

        return result;
    }


}
