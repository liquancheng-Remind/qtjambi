import com.trolltech.qt.*;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import com.trolltech.qt.xml.*;
import com.trolltech.qt.network.*;
import com.trolltech.qt.sql.*;
import com.trolltech.qt.svg.*;


public class src_gui_widgets_qlabel {
    public static void main(String args[]) {
        QApplication.initialize(args);
//! [0]
    QLabel label = new QLabel();
    label.setFrameStyle(QFrame.Shadow.Sunken.value() | QFrame.Shape.Panel.value() );
    label.setText("first line\nsecond line");
    label.setAlignment(Qt.AlignmentFlag.AlignBottom, Qt.AlignmentFlag.AlignRight);
//! [0]


//! [1]
    QLineEdit phoneEdit = new QLineEdit();
    QLabel phoneLabel = new QLabel("Phone:");
    phoneLabel.setBuddy(phoneEdit);
//! [1]


//! [2]
    QLineEdit nameEd  = new QLineEdit();
    QLabel    nameLb  = new QLabel("Name:");
    nameLb.setBuddy(nameEd);
    QLineEdit phoneEd = new QLineEdit();
    QLabel    phoneLb = new QLabel("Phone:");
    phoneLb.setBuddy(phoneEd);
    // (layout setup not shown)
//! [2]


    }
}
