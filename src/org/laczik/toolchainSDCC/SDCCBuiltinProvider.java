/*
    SDCC Toolchain allows MPLABX to compile with SDCC+GPUtils for pic 16/18
    Copyright (C) 2011 RMA de Almeida, 2015 ZJ Laczik and 2016 P Hayes.

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.laczik.toolchainSDCC;

import com.microchip.mplab.nbide.embedded.spi.BuiltinProvider;
import java.util.HashSet;
import java.util.Set;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ProjectConfiguration;

public class SDCCBuiltinProvider implements BuiltinProvider {

    private static final Set<String> BUILTINS;

    static { 
        BUILTINS = new HashSet<>();
//        BUILTINS.add("_nop");
    }

    @Override
    public Set<String> getBuiltins(Project project, ProjectConfiguration projectConf, String itemPath) {
        return BUILTINS;
    }
}
