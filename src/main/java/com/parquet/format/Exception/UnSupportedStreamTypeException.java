package com.parquet.format.Exception;

import java.io.IOException;

public class UnSupportedStreamTypeException extends IOException {
  public UnSupportedStreamTypeException(String cause) {
    super(cause);
  }
}
