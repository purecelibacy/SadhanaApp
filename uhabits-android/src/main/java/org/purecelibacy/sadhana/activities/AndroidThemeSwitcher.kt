/*
 * Copyright (C) 2016 Álinson Santos Xavier <isoron@gmail.com>
 *
 * This file is part of Loop Habit Tracker.
 *
 * Loop Habit Tracker is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * Loop Habit Tracker is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.purecelibacy.sadhana.activities

import org.purecelibacy.androidbase.activities.*
import org.purecelibacy.sadhana.*
import org.purecelibacy.sadhana.core.preferences.*
import org.purecelibacy.sadhana.core.ui.*
import javax.inject.*

@ActivityScope
class AndroidThemeSwitcher
@Inject constructor(
        private val activity: BaseActivity,
        preferences: Preferences
) : ThemeSwitcher(preferences) {

    override fun applyDarkTheme() {
        activity.setTheme(R.style.AppBaseThemeDark)
    }

    override fun applyLightTheme() {
        activity.setTheme(R.style.AppBaseTheme)
    }

    override fun applyPureBlackTheme() {
        activity.setTheme(R.style.AppBaseThemeDark_PureBlack)
    }
}
