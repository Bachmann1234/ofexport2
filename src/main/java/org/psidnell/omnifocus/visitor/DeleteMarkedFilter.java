/*
 * Copyright 2015 Paul Sidnell
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
package org.psidnell.omnifocus.visitor;

import org.psidnell.omnifocus.model.Context;
import org.psidnell.omnifocus.model.Folder;
import org.psidnell.omnifocus.model.Project;
import org.psidnell.omnifocus.model.Task;

/**
 * @author psidnell
 *
 * Delete marked items.
 */
public class DeleteMarkedFilter implements Visitor {

    private static final VisitorDescriptor WHAT = new VisitorDescriptor().visitAll().filterAll();

    @Override
    public VisitorDescriptor getWhat() {
        return WHAT;
    }

    @Override
    public boolean includeDown(Context c) {
        return !c.isMarked();
    }

    @Override
    public boolean includeDown(Folder f) {
        return !f.isMarked();
    }

    @Override
    public boolean includeDown(Project p) {
        return !p.isMarked();
    }

    @Override
    public boolean includeDown(Task t) {
        return !t.isMarked();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
