package com.jawa.utsposclient.views.cashier;

import com.jawa.utsposclient.enums.AppScene;
import com.jawa.utsposclient.views.Controller;
import com.jawa.utsposclient.views.UserController;
import javafx.fxml.FXML;

import java.io.IOException;

public class CashierController extends Controller implements UserController {
    @FXML
    public void onBackToHome() throws IOException {
        switchScene(AppScene.CASHIER_HOME);
    }

    @Override
    public void onSwitchToHistory() throws Exception {
        switchScene(AppScene.TRANSACTION_HISTORY);
    }
}
