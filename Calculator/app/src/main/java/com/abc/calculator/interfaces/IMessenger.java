package com.abc.calculator.interfaces;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public interface IMessenger {
    void onSendMessage(Fragment fragment, Bundle bundle);
}
