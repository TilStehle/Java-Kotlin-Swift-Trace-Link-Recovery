package de.unihamburg.swk.parsing.antlr4.swift4;

import java.util.Stack;

public class LocalScopeTracker {
	public Stack<Boolean> isElementLocal;

	public LocalScopeTracker() {
		this.isElementLocal = new Stack<>();
	}
	
	@SuppressWarnings("boxing")
	public void enterLocalScope(boolean b) {
		this.isElementLocal.push(b);
//		System.out.println("enter " + isElementLocal.size());
	}
	
	@SuppressWarnings("boxing")
	public boolean isScopeLocal() {
//		System.out.println("peek " + (isElementLocal.isEmpty() ? false : isElementLocal.peek()));
		return isElementLocal.isEmpty() ? false : isElementLocal.peek();
	}
	
	public void exitScope() {
//		System.out.println("exit " + isElementLocal.size());
		this.isElementLocal.pop();
	}
}