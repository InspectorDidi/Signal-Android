package org.thoughtcrime.securesms;

public class TransportOption {
  int    drawable;
  String text;
  String key;
  String composeHint;

  public TransportOption(String key, int drawable, String text, String composeHint) {
    this.key         = key;
    this.drawable    = drawable;
    this.text        = text;
    this.composeHint = composeHint;
  }

  public boolean isForcedPlaintext() {
    return key.equals("insecure_sms");
  }

  public boolean isForcedSms() {
    return key.equals("insecure_sms") || key.equals("secure_sms");
  }
}

