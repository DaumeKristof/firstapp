package hu.firstapp.model.service;

import java.util.List;

public class SimpleMax implements SimpleStrategy<Integer> {
	private final List<Integer> list;

	public SimpleMax(List<Integer> list) {
		super();
		this.list = list;
	}

	@Override
	public Integer getResult(int denominator) {
		return list.stream().mapToInt(i -> i).max().getAsInt();
		
	}

}
