package seedu.address.model.project;

import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

class ProjectTest {

    @Test
    public void constructor_nullParam_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Project(null, new Repository("tom/tp"),
                new Deadline("2022-03-05")));
    }

    @Test
    public void constructor_invalidName_throwsIllegalArgumentException() {
        String invalidName = "";
        assertThrows(IllegalArgumentException.class, () -> new Project(new Name(invalidName),
                new Repository("tom/tp"), new Deadline("2022-03-05")));
    }
}
