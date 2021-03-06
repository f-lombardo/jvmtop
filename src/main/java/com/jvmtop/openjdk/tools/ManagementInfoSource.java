/**
 * jvmtop - java monitoring for the command-line
 * 
 * Copyright (C) 2015 by Patric Rufflar. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package com.jvmtop.openjdk.tools;

import java.io.IOException;
import java.lang.management.ClassLoadingMXBean;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.MemoryMXBean;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.RuntimeMXBean;
import java.lang.management.ThreadMXBean;
import java.util.Collection;

/**
 * TODO: document this type!
 *
 * @author francol
 *
 */
public interface ManagementInfoSource
{

  /**
   * @return
   */
  public boolean isDead();

  /**
   * 
   */
  public void flush();

  /**
   * @return
   * @throws IOException 
   * @throws Exception 
   */
  public OperatingSystemMXBean getSunOperatingSystemMXBean() throws Exception;

  /**
   * @return
   * @throws IOException 
   */
  public RuntimeMXBean getRuntimeMXBean() throws IOException;

  /**
   * @return
   * @throws IOException 
   */
  public Collection<GarbageCollectorMXBean> getGarbageCollectorMXBeans()
      throws IOException;

  /**
   * @return
   * @throws IOException 
   */
  public ClassLoadingMXBean getClassLoadingMXBean() throws IOException;

  /**
   * @return
   * @throws IOException 
   */
  public MemoryMXBean getMemoryMXBean() throws IOException;

  /**
   * @return
   * @throws IOException 
   */
  public ThreadMXBean getThreadMXBean() throws IOException;

  /**
   * @return
   * @throws Exception 
   */
  public long getProcessCpuTime() throws Exception;

}
