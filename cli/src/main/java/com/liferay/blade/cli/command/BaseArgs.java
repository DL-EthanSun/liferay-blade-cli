/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.liferay.blade.cli.command;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import java.io.File;

/**
 * @author Gregory Amerson
 */
@Parameters(commandDescription = "Options valid for all commands. Must be given before sub command")
public class BaseArgs {

	public String getBase() {
		return _base;
	}

	public boolean isHelp() {
		return _help;
	}

	public boolean isQuiet() {
		return _quiet;
	}

	public boolean isTrace() {
		return _trace;
	}

	public void setBase(File baseDir) {
		_base = baseDir.getAbsolutePath();
	}

	@Parameter(
		description = "Specify a new base directory (default working directory).", hidden = true, names = "--base"
	)
	private String _base = System.getProperty("user.dir");

	@Parameter(description = "Get help on a specific command.", help = true, names = "--help")
	private boolean _help;

	@Parameter(description = "Do not print any optional messages to console.", hidden = true, names = {"-q", "--quiet"})
	private boolean _quiet;

	@Parameter(description = "Print exception stack traces when they occur.", hidden = true, names = "--trace")
	private boolean _trace;

}