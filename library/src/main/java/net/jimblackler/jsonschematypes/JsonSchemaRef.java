package net.jimblackler.jsonschematypes;

import java.net.URI;
import java.net.URISyntaxException;

public class JsonSchemaRef {
  public static URI append(URI uri, String value) {
    try {
      String fragment = uri.getFragment();
      if (fragment == null) {
        fragment = "";
      }
      if (!fragment.endsWith("/")) {
        fragment += "/";
      }
      // See https://tools.ietf.org/html/rfc6901#section-3
      String escaped = value.replace("/", "~1").replace("~", "~1");
      return new URI(uri.getScheme(), uri.getSchemeSpecificPart(), fragment + escaped);
    } catch (URISyntaxException e) {
      throw new IllegalStateException(e);
    }
  }
}
