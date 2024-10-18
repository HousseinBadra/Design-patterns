package FlyWeight;

import java.util.Map;
import java.util.HashMap;

// Flyweight Factory to manage shared styles
class CharacterStyleFactory {
    private static Map<String, CharacterStyle> styleMap = new HashMap<>();

    public static CharacterStyle getStyle(String font, int fontSize, String color) {
        String key = font + fontSize + color;
        if (!styleMap.containsKey(key)) {
            styleMap.put(key, new CharacterStyle(font, fontSize, color));
        }
        return styleMap.get(key);
    }
}
