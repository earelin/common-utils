package org.earelin.commons.text;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.text.WordUtils;

public class CaseUtils {

  public static String convertToKebabCase(String text) {
    return normalize(text)
        .replace(' ', '-');
  }

  public static String convertToCamelCase(String text) {
    String normalizedText = normalize(text);
    return WordUtils.capitalize(normalizedText)
        .replace(" ", "");
  }

  public static String normalize(String text) {
    return StringUtils
        .normalizeSpace(text)
        .toLowerCase();
  }

  private CaseUtils() {}
}
