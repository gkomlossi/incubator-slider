/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.slider.funtest.framework

import org.apache.bigtop.itest.shell.Shell
import org.apache.slider.core.exceptions.SliderException
import org.apache.slider.common.tools.SliderUtils
import org.slf4j.Logger
import org.slf4j.LoggerFactory


class AccumuloSliderShell extends ShellBase {

  public static File scriptFile;

  /**
   * Build the command
   * @param commands
   */
  AccumuloSliderShell(Collection<String> commands) {
    super(scriptFile.absolutePath + " " + commands.join(" "))
  }

  /**
   * Exec any slider command
   * @param conf
   * @param commands
   * @return the shell
   */
  public static AccumuloSliderShell run(int exitCode, String command) {
    AccumuloSliderShell shell = new AccumuloSliderShell([command])
    shell.execute(exitCode);
    return shell
  }

}
