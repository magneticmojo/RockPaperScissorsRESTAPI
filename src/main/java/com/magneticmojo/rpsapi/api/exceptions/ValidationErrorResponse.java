package com.magneticmojo.rpsapi.api.exceptions;

import java.util.List;

/**
 * Represents a response for validation errors.
 * The response includes the HTTP status code and a list of error messages.
 */
public record ValidationErrorResponse(int HttpStatusCode, List<String> errors) {
}
