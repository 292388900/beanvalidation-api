/*
 * JBoss, Home of Professional Open Source
 * Copyright 2012, Red Hat, Inc. and/or its affiliates, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package javax.validation.metadata;

import javax.validation.metadata.ElementDescriptor;

/**
 * Describes a validated return value of a method or constructor.
 *
 * @author Gunnar Morling
 */
public interface ReturnValueDescriptor extends ElementDescriptor {

	/**
	 * Whether a cascaded validation for this return value shall be performed or
	 * not.
	 *
	 * @return <code>true</code>, if this return value shall be validated
	 *         recursively, <code>false</code> otherwise.
	 */
	boolean isCascaded();
}
