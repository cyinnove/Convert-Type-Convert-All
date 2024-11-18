package burp;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class Menu implements IContextMenuFactory {
    private final IExtensionHelpers m_helpers;

    public Menu(IExtensionHelpers helpers) {
        m_helpers = helpers;
    }

    public List<JMenuItem> createMenuItems(final IContextMenuInvocation invocation) {
        List<JMenuItem> menus = new ArrayList();

        if (invocation.getToolFlag() != IBurpExtenderCallbacks.TOOL_INTRUDER && invocation.getInvocationContext() != IContextMenuInvocation.CONTEXT_MESSAGE_EDITOR_REQUEST){
            return menus;
        }

        JMenuItem sendXMLToRepeater = new JMenuItem("Convert to XML");
        JMenuItem sendJSONToRepeater = new JMenuItem("Convert to JSON");
        JMenuItem convertToURLEncoded = new JMenuItem("Convert JSON to URL-encoded");
        JMenuItem convertToGetRequest = new JMenuItem("Convert JSON to GET Request");

        // Original XML conversion
        sendXMLToRepeater.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent arg0) {}
            public void mouseEntered(MouseEvent arg0) {}
            public void mouseExited(MouseEvent arg0) {}
            public void mousePressed(MouseEvent arg0) {}
            public void mouseReleased(MouseEvent arg0) {
                IHttpRequestResponse iReqResp = invocation.getSelectedMessages()[0];
                try {
                    byte[] request = Utilities.convertToXML(m_helpers, iReqResp);
                    if (request != null) {
                        iReqResp.setRequest(request);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // Original JSON conversion
        sendJSONToRepeater.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent arg0) {}
            public void mouseEntered(MouseEvent arg0) {}
            public void mouseExited(MouseEvent arg0) {}
            public void mousePressed(MouseEvent arg0) {}
            public void mouseReleased(MouseEvent arg0) {
                IHttpRequestResponse iReqResp = invocation.getSelectedMessages()[0];
                try {
                    byte[] request = Utilities.convertToJSON(m_helpers, iReqResp);
                    if (request != null) {
                        iReqResp.setRequest(request);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // New JSON to URL-encoded conversion
        convertToURLEncoded.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent arg0) {}
            public void mouseEntered(MouseEvent arg0) {}
            public void mouseExited(MouseEvent arg0) {}
            public void mousePressed(MouseEvent arg0) {}
            public void mouseReleased(MouseEvent arg0) {
                IHttpRequestResponse iReqResp = invocation.getSelectedMessages()[0];
                try {
                    byte[] request = Utilities.convertToURLEncoded(m_helpers, iReqResp);
                    if (request != null) {
                        iReqResp.setRequest(request);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // New JSON to GET request conversion
        convertToGetRequest.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent arg0) {}
            public void mouseEntered(MouseEvent arg0) {}
            public void mouseExited(MouseEvent arg0) {}
            public void mousePressed(MouseEvent arg0) {}
            public void mouseReleased(MouseEvent arg0) {
                IHttpRequestResponse iReqResp = invocation.getSelectedMessages()[0];
                try {
                    byte[] request = Utilities.convertToGetRequest(m_helpers, iReqResp);
                    if (request != null) {
                        iReqResp.setRequest(request);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        menus.add(sendXMLToRepeater);
        menus.add(sendJSONToRepeater);
        menus.add(convertToURLEncoded);
        menus.add(convertToGetRequest);
        return menus;
    }
}