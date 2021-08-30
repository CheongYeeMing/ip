package duke.exception;

import duke.ui.Ui;

/**
 * This exception is thrown when an unsupported
 * format of date or time is input.
 *
 * @author Cheong Yee Ming
 * @version Duke A-JavaDoc
 */
public class InvalidDateTimeException extends DukeException {

    /**
     * Constructor for an InvalidDateTimeException.
     *
     * @param ui Prints message with respect to user input.
     */
    public InvalidDateTimeException(Ui ui) {
        super(ui);
    }

    /**
     * Returns an error message to highlight that
     * the date or time format that is input is not supported.
     * The supported format is included.
     *
     * @return The error message.
     */
    @Override
    public String getMessage() {
        return super.errorMessage("The format of Data/Time entered is invalid.\n " +
                "    Do enter the Date/Time in yyyy-MM-dd HH:mm.");
    }
}
