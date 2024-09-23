package com.evergent.Corejava.Immutable;

public final class ImmutableString {
	private final String value;
	public ImmutableString(String value) {
		this.value = value;
	}
	/* public String myvalue(){
	 * 	return value;
	 * }
	 */
	public String toString() {
		return value;
	}
}
