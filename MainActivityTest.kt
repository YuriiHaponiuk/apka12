@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun clickDaneOsoboweButton_opensDaneActivity() {
        onView(withId(R.id.buttonDane)).perform(click())
        onView(withText("Dane osobowe")).check(matches(isDisplayed()))
    }
}
