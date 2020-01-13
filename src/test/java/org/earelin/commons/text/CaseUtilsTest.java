package org.earelin.commons.text;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaseUtilsTest {

  private static final String DIFFICULT_TEXT = "  A  very diFFicult \n Text 1 time ";

  @Test
  public void shouldConvertTextToKebabCase() {
    assertEquals("a-very-difficult-text-1-time",
        CaseUtils.convertToKebabCase(DIFFICULT_TEXT));
  }

  @Test
  public void shouldConvertTextToCamelCase() {
    assertEquals("AVeryDifficultText1Time",
        CaseUtils.convertToCamelCase(DIFFICULT_TEXT));
  }

  @Test
  public void shouldNormalizeText() {
    assertEquals("a very difficult text 1 time",
        CaseUtils.normalize(DIFFICULT_TEXT));
  }

}
