package jeux_projet;

import java.beans.Beans;

import javax.swing.JButton;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StyledButton extends JButton {
	private Color normalStart;
    private Color normalEnd;
    private Color normalText;
    
    private Color hoverStart;
    private Color hoverEnd;
    private Color hoverText;
    
    private Color currentStart;
    private Color currentEnd;
    private Color currentText;

    private int radius = 5;

    // Partie normal
	public Color getNormalStart() {
		return normalStart;
	}
	public void setNormalStart(Color normalStart) {
		this.normalStart = normalStart;
	}

	public Color getNormalEnd() {
		return normalEnd;
	}
	public void setNormalEnd(Color normalEnd) {
		this.normalEnd = normalEnd;
	}
	
	public Color getNormalText() {
		return normalText;
	}
	public void setNormalText(Color normalText) {
		this.normalText = normalText;
		repaint();
	}

	// Partie hover
	public Color getHoverStart() {
		return hoverStart;
	}
	public void setHoverStart(Color hoverStart) {
		this.hoverStart = hoverStart;
	}

	public Color getHoverEnd() {
		return hoverEnd;
	}
	public void setHoverEnd(Color hoverEnd) {
		this.hoverEnd = hoverEnd;
	}
	
	public Color getHoverText() {
		return hoverText;
	}
	public void setHoverText(Color hoverText) {
		this.hoverText = hoverText;
		repaint();
	}
	
	// Partie current
	public Color getCurrentStart() {
		return currentStart;
	}
	public void setCurrentStart(Color currentStart) {
		this.currentStart = currentStart;
	}

	public Color getCurrentEnd() {
		return currentEnd;
	}
	public void setCurrentEnd(Color currentEnd) {
		this.currentEnd = currentEnd;
	}
	
	public Color getCurrentText() {
		return currentText;
	}
	public void setCurrentText(Color currentText) {
		this.currentText = currentText;
	}

	public StyledButton(
			String text, 
			Color normalStart, 
			Color normalEnd, 
			Color normalText,
			Color hoverStart, 
			Color hoverEnd,
			Color hoverText) {
		super(text);
		this.normalStart = normalStart;
		this.normalEnd = normalEnd;
		this.normalText = normalText;
		this.hoverStart = hoverStart;
		this.hoverEnd = hoverEnd;
		this.hoverText = hoverText;
		
		this.currentStart = normalStart;
	    this.currentEnd = normalEnd;
	    this.currentText = normalText;

		setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setForeground(normalText);
        setCursor(new Cursor(Cursor.HAND_CURSOR));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	currentStart = hoverStart; 
            	currentEnd = hoverEnd; 
            	setForeground(hoverText);
            	repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	currentStart = normalStart; 
            	currentEnd = normalEnd; 
            	setForeground(normalText);
            	repaint();
            }
        });
    }    
	
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);

        if (Beans.isDesignTime()) {
        	g2.setColor(Color.LIGHT_GRAY);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        }
        else {
	        GradientPaint gradient = new GradientPaint(
	                0, 0, currentStart,
	                0, getHeight(), currentEnd
	        );
	
	        g2.setPaint(gradient);
	        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        }
        
        g2.dispose();
        
        super.paintComponent(g);
    }

    protected void paintBorder(Graphics g) {
        g.setColor(new Color(205, 205, 205, 120));
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius, radius);
    }
}

