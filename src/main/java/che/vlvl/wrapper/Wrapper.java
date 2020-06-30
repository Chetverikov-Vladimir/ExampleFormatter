package che.vlvl.wrapper;

import che.vlvl.concepts.ConceptFactory;
import che.vlvl.concepts.ConceptTypes;

import java.util.LinkedHashMap;

/**
 * Class for wrapping an entry in tags
 */
public class Wrapper {

    private ConceptFactory conceptFactory;

    public Wrapper() {
        conceptFactory = new ConceptFactory();
    }

    /**
     * Method for "wrapping" the transmitted string sequence in the necessary tags
     * @param textForWrapping LinkedHashMap: {text for wrap -> type wrapping}
     * @return wrappered text
     */
    public String wrapFeed(LinkedHashMap<String, ConceptTypes> textForWrapping) {

        if (textForWrapping == null) return "";

        StringBuilder result = new StringBuilder();

        textForWrapping.entrySet()
                .forEach(
                        entry -> result.append(
                                conceptFactory.getWrapper(entry.getValue())
                                        .wrapText(entry.getKey()))
                                .append(" "));

        return result.toString().trim();

    }

}

