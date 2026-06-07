/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.platform.repository.init;

import org.tura.platform.repository.neo4j.operation.SequenceGenerator;

public class LongSequenceGenerator implements SequenceGenerator{
	
	private Long sequence =-1L;
	private long step = 1;

	public LongSequenceGenerator( ) {
	}	
	
	public LongSequenceGenerator(Long sequence,long step ) {
		this.sequence = sequence;
		this.step = step;
	}
	
	public LongSequenceGenerator(Long sequence ) {
		this.sequence = sequence;
	}	
	
	public long getStep() {
		return step;
	}

	public void setStep(long step) {
		this.step = step;
	}

	@SuppressWarnings("unchecked")
	@Override
	public  synchronized <T> T  generate() {
		sequence = sequence+step;
		return (T) sequence;
	}

	public long getSequence() {
		return sequence;
	}

	public void setSequence(long sequence) {
		this.sequence = sequence;
	}

	
	
	
}
