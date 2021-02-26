package net.hypixel.skyblock.util;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import com.google.common.collect.Lists;

/**
 * A {@link Consumer}
 * 
 * @author MrPineapple070
 * @version 17 December 2020
 * @since 11 July 2019
 * @param <T> consumer type
 */
public abstract class DelayedConsumer<T> {
	private List<Consumer<T>> tasks = Lists.newArrayList();
	private T key = null;

	/**
	 * Consume when ready
	 * 
	 * @param task {@link Consumer}
	 */
	public void consumeWhenReady(Consumer<T> task) {
		if (key == null) {
			tasks.add(task);
		} else {
			task.accept(key);
		}
	}

	/**
	 * Key ready
	 * 
	 * @param key for {@link Consumer}
	 */
	public void keyReady(T key) {
		this.key = key;
		Iterator<Consumer<T>> it = tasks.iterator();
		while (it.hasNext()) {
			Consumer<T> task = it.next();
			it.remove();
			task.accept(key);
		}
	}
}