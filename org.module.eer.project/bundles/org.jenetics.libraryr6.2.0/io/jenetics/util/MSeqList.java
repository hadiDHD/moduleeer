/*
 * Java Genetic Algorithm Library (jenetics-6.2.0).
 * Copyright (c) 2007-2021 Franz Wilhelmstötter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author:
 *    Franz Wilhelmstötter (franz.wilhelmstoetter@gmail.com)
 */
package io.jenetics.util;

/**
 * @author <a href="mailto:franz.wilhelmstoetter@gmail.com">Franz Wilhelmstötter</a>
 * @version 3.4
 * @since 3.4
 */
final class MSeqList<T> extends BaseSeqList<T> {
	private static final long serialVersionUID = 1L;

	MSeqList(final MSeq<T> array) {
		super(array);
	}

	@Override
	@SuppressWarnings("unchecked")
	public T set(final int index, final T element) {
		final T oldElement = seq.get(index);
		((MSeq<T>)seq).set(index, element);
		return oldElement;
	}

}
