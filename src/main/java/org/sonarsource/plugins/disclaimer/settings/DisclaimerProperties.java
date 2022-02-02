/*
 * Example Plugin for SonarQube
 * Copyright (C) 2009-2020 SonarSource SA
 * mailto:contact AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonarsource.plugins.disclaimer.settings;

import java.util.List;
import org.sonar.api.config.PropertyDefinition;

import static java.util.Arrays.asList;

public class DisclaimerProperties {

  public static final String CATEGORY = "Disclaimer";

  /*
  public static final String DISCLAIMER_HTML_KEY = "sonar.disclaimer.html.enabled";
  public static final String DISCLAIMER_HTML_CONTENT_KEY = "sonar.disclaimer.html.content";
  */

  public static final String DISCLAIMER_SCANNER_KEY = "sonar.disclaimer.scanner.enabled";
  public static final String DISCLAIMER_SCANNER_CONTENT_KEY = "sonar.disclaimer.scanner.content";

  private DisclaimerProperties() {
    // only statics
  }

  public static List<PropertyDefinition> getProperties() {
    return asList(
      /*
      PropertyDefinition.builder(DISCLAIMER_HTML_KEY)
        .name("HTML enabled")
        .description("Display the HTML disclaimer (Top menu -> More -> Disclaimer)")
        .defaultValue(String.valueOf(true))
        .category(CATEGORY)
        .build(),
      PropertyDefinition.builder(DISCLAIMER_HTML_CONTENT_KEY)
        .name("HTML content")
        .description("Content of the HTML disclaimer (Top menu -> More -> Disclaimer)")
        .defaultValue("<!DOCTYPE html> <html> <head><title>Disclaimer</title></head> <body><p>My disclaimer definition</p></body> </html>")
        .category(CATEGORY)
        .build(),
      */
      PropertyDefinition.builder(DISCLAIMER_SCANNER_KEY)
        .name("Scanner enabled")
        .description("Display the disclaimer in the sonar-scanner execution traces (level: INFO)")
        .defaultValue(String.valueOf(true))
        .category(CATEGORY)
        .build(),
      PropertyDefinition.builder(DISCLAIMER_SCANNER_CONTENT_KEY)
        .name("Scanner content")
        .description("Content of disclaimer of the sonar-scanner")
        .defaultValue("----------------- Airbus - Sonarqube Disclaimer -----------------\n   General Data Protection Regulations / Export Control / Occar  \n             https://confluence.airbus.corp/x/QoypDQ             \n-----------------------------------------------------------------")
        .category(CATEGORY)
        .build());
  }

}