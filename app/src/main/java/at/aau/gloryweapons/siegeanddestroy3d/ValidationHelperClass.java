package at.aau.gloryweapons.siegeanddestroy3d;

/**
 * Created by Alexander on 05.04.2018.
 */

public class ValidationHelperClass {

    public static boolean isUserNameValid(String username) {
        if (username == null || username.trim().isEmpty())
            return false;
        else
            return true;
    }

    public static boolean isServerIpValid(String ip) {
        try {
            if (ip == null || ip.isEmpty()) {
                return false;
            }

            String[] parts = ip.split("\\.");
            if (parts.length != 4) {
                return false;
            }

            for (String s : parts) {
                int i = Integer.parseInt(s);
                if ((i < 0) || (i > 255)) {
                    return false;
                }
            }
            if (ip.endsWith(".")) {
                return false;
            }

            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
