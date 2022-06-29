package com.javateam.score;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.javateam.score.domain.SubjectDTO2;
import com.javateam.score.util.ScoreService;
import com.javateam.score.util.ScoreServiceImpl;

/**
 * 국영수 총점/평균 프로그램
 * 
 * @author javateam 
 * @since 2022.6.14
 * @version 1.2
 */
public class Ex15 extends Frame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	Label 			tLabel;
	TextField		tf;
	Button			b;
	Panel			p1;
	
	public Ex15() {
		
		super("학생 성적 전송");
		p1 = new Panel(); 

		tLabel = new Label("학생이름(한글)/국/영/수 과목 점수를 입력하십시오 :"); 
		tf  = new TextField(50);

		tf.addActionListener(this);

		b = new Button("종료");

		p1.add(tLabel);
		p1.add(tf); 
		p1.add(b);

		add(p1,"South");
		
		// 창닫기 이벤트 핸들러
		this.addWindowListener(new WindowAdapter() {
			    
		    @Override
		    public void windowClosing(WindowEvent e) {

		    	e.getWindow().setVisible(false);
		    	e.getWindow().dispose();
		    	System.exit(0);
		    }
		    
	    }); //
		
		// 종료 버튼의 창닫기
	    b.addMouseListener(new MouseAdapter() {
	    
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	System.exit(0);     
		    }
		    
	    }); //
		
	} // 생성자
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		ScoreService scoreSvc = new ScoreServiceImpl();
		
		// java 파일 기본 encoding 방식
		System.out.println("file encoding : "
						+ System.getProperty("file.encoding"));
		
		System.out.println("tf : " + tf.getText().trim());
				
		SubjectDTO2 subjectDTO2 = scoreSvc.inputScore(tf, tf.getText().trim());
		System.out.println("subjectDTO2 : " + subjectDTO2);
		
		scoreSvc.sendScores(subjectDTO2);
	} //
	
	public static void main(String[] args) {

		Ex15 clientWindow = new Ex15();
		clientWindow.setBounds(0, 0, 800, 80);
		clientWindow.setVisible(true);
		
	} //

}
