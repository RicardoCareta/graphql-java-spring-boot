package com.pds.graphqljava.exception;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

@JsonInclude(value = Include.NON_NULL) //TODO Find alternative way to do it
public class NotFoundException extends Exception implements GraphQLError{

	private static final long serialVersionUID = 1L;
	
	public NotFoundException(String message) {
		super(message);
	}
	
	@Override
	public Map<String, Object> getExtensions() {
		return null;
	}
	
	@Override
	public StackTraceElement[] getStackTrace() {
		return null;
	}
	
	@Override
	public List<SourceLocation> getLocations() {
		return null;
	}

	@Override
	public ErrorType getErrorType() {
		return ErrorType.ValidationError;
	}

}
