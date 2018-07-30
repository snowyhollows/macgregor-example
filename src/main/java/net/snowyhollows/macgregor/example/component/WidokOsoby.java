/*
 * Copyright (c) 2009-2018 Ericsson AB, Sweden. All rights reserved.
 *
 * The Copyright to the computer program(s) herein is the property of Ericsson AB, Sweden.
 * The program(s) may be used  and/or copied with the written permission from Ericsson AB
 * or in accordance with the terms and conditions stipulated in the agreement/contract under
 * which the program(s) have been supplied.
 *
 */
package net.snowyhollows.macgregor.example.component;

import net.snowyhollows.macgregor.example.model.Osoba;
import net.snowyhollows.mcgregor.api.ComponentBuilder;
import net.snowyhollows.mcgregor.tag.PureContainer;

@ComponentBuilder
abstract public class WidokOsoby extends PureContainer  {

	Osoba model;

	public Osoba getModel() {
		return model;
	}

	public void setModel(Osoba model) {
		this.model = model;
	}
}
