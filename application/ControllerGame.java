package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControllerGame implements Initializable {
	@FXML
	private Label lives;
	@FXML
	private TextField text;
	@FXML
	private Button a;
	@FXML
	private Button b;
	@FXML
	private Button c;
	@FXML
	private Button d;
	@FXML
	private Button e;
	@FXML
	private Button f;
	@FXML
	private Button g;
	@FXML
	private Button h;
	@FXML
	private Button i;
	@FXML
	private Button j;
	@FXML
	private Button k;
	@FXML
	private Button l;
	@FXML
	private Button m;
	@FXML
	private Button n;
	@FXML
	private Button o;
	@FXML
	private Button p;
	@FXML
	private Button q;
	@FXML
	private Button r;
	@FXML
	private Button s;
	@FXML
	private Button t;
	@FXML
	private Button u;
	@FXML
	private Button v;
	@FXML
	private Button w;
	@FXML
	private Button x;
	@FXML
	private Button y;
	@FXML
	private Button z;
	@FXML
	private Line base;
	@FXML
	private Line  horizontal;
	@FXML
	private Line vertical;
	@FXML
	private Line body;
	@FXML
	private Line leftArm;
	@FXML
	private Line LeftLeg;
	@FXML
	private Line rightArm;
	@FXML
	private Line rightLeg;
	@FXML
	private Line holder;
	@FXML
	private Circle head;
/////////////////////////////////////////////////////////////////////////////////////////
	app game=new app();
	char guessed;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	text.setEditable(false);
	text.setText(String.copyValueOf(game.Secret2));
head.setVisible(false);
vertical.setVisible(false);
leftArm.setVisible(false);
holder.setVisible(false);
horizontal.setVisible(false);
body.setVisible(false);
rightArm.setVisible(false);
rightLeg.setVisible(false);
LeftLeg.setVisible(false);
base.setVisible(false);
	}
	
			
/////////////////////////////////////////////////////////////////////////////////////////////		
		public void handle (ActionEvent event) {
			int num = 0;
			  if(event.getSource()== a) {
					String input=a.getText();
					guessed=input.charAt(0);
					num=game.guess(guessed);
					text.setText(String.copyValueOf(game.Secret2));

					FadeTransition fade=new FadeTransition(Duration.seconds(1.5),a);
					fade.setFromValue(1.0);
					fade.setToValue(0.0);
					if(num==2 ||num==1) {
						fade.play();
						a.setDisable(true);
						}

					}
		 else if(event.getSource()== b) {
				String input=b.getText();
				guessed=input.charAt(0);
				num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));

				FadeTransition fade=new FadeTransition(Duration.seconds(1.5),b);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					b.setDisable(true);
					}

				}
		 else if(event.getSource()== c) {
				String input=c.getText();
				guessed=input.charAt(0);
				num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(1.5),c);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					c.setDisable(true);
					}

				}
		 else if(event.getSource()== d) {
				String input=d.getText();
				guessed=input.charAt(0);
				num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),d);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					d.setDisable(true);
					}

				}
		 else if(event.getSource()== e) {
				String input=e.getText();
				guessed=input.charAt(0);
				num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),e);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					e.setDisable(true);
					}

				}
		 else if(event.getSource()== f) {
				String input=f.getText();
				guessed=input.charAt(0);
				num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),f);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					f.setDisable(true);
					}

				}
		 else if(event.getSource()== g) {
				String input=g.getText();
				guessed=input.charAt(0);
				num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),g);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					g.setDisable(true);
					}

				}
		 else if(event.getSource()== h) {
				String input=h.getText();
				guessed=input.charAt(0);
				num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),h);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					h.setDisable(true);
					}

				}
		 else if(event.getSource()== i) {
				String input=i.getText();
				guessed=input.charAt(0);
				num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),i);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					i.setDisable(true);
					}

				}
		 else if(event.getSource()== j) {
				String input=j.getText();
				guessed=input.charAt(0);
				num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),j);
				fade.setFromValue(1.0);
				if(num==2 ||num==1) {
					fade.play();
					j.setDisable(true);
					}
				}
		 else if(event.getSource()== k) {
				String input=k.getText();
				guessed=input.charAt(0);
				num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),k);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					k.setDisable(true);
					}

				}
		 else if(event.getSource()== l) {
				String input=l.getText();
				guessed=input.charAt(0);
				num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),l);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					l.setDisable(true);
					}

				}
		 else if(event.getSource()== m) {
				String input=m.getText();
				guessed=input.charAt(0);
				num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),m);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					m.setDisable(true);
					}

				}
		 else if(event.getSource()== n) {
				String input=n.getText();
				guessed=input.charAt(0);
				num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),n);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					n.setDisable(true);
					}

				}
		 else if(event.getSource()== o) {
				String input=o.getText();
				guessed=input.charAt(0);
				num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),o);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					o.setDisable(true);
					}

				}
		 else if(event.getSource()== p) {
				String input=p.getText();
				guessed=input.charAt(0);
				num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),p);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					p.setDisable(true);
					}

				}
		 else if(event.getSource()== q) {
				String input=q.getText();
				guessed=input.charAt(0);
				num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),q);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					q.setDisable(true);
					}

				}
		 else if(event.getSource()== r) {
				String input=r.getText();
				guessed=input.charAt(0);
				num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),r);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					r.setDisable(true);
					}

				}
		 else if(event.getSource()== s) {
			 String input=s.getText();
				guessed=input.charAt(0);
				num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),s);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					s.setDisable(true);
					}

				}
		 else if(event.getSource()== t) {
				String input=t.getText();
				guessed=input.charAt(0);
				num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),t);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					t.setDisable(true);
					}

				}
		 else if(event.getSource()== u) {
				String input=u.getText();
				guessed=input.charAt(0);
			num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),u);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					u.setDisable(true);
					}

				}
		 else if(event.getSource()== v) {
				String input=v.getText();
				guessed=input.charAt(0);
				num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),v);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					v.setDisable(true);
					}

				}
		 else if(event.getSource()== w) {
				String input=w.getText();
				guessed=input.charAt(0);
				 num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),w);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					w.setDisable(true);
					}
				}
		 
		 else if(event.getSource()== x) {
				String input=x.getText();
				guessed=input.charAt(0);
				 num=game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),x);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					x.setDisable(true);
					}

				}
		 else if(event.getSource()== y) {
				String input=y.getText();
				guessed=input.charAt(0);
		    	num=	game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),y);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					y.setDisable(true);
					}

				}
		 else if(event.getSource()== z) {
				String input=z.getText();
				guessed=input.charAt(0);
		    	num=	game.guess(guessed);
				text.setText(String.copyValueOf(game.Secret2));
				FadeTransition fade=new FadeTransition(Duration.seconds(2),z);
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				if(num==2 ||num==1) {
					fade.play();
					z.setDisable(true);
					}
				}
	
         if(num==0) {
        	 int k=10-game.error;
        	 lives.setText(""+k+"");
        	 if(k==9) {
        		 base.setVisible(true);
        	 }
        	 else if(k==8) {
        		vertical.setVisible(true);
        	 }
        	 else if(k==7) {
         		horizontal.setVisible(true);
         	 }
        	 else if(k==6) {
         		holder.setVisible(true);
         	 }
        	 else if(k==5) {
          		head.setVisible(true);
          	 }
        	 else if(k==4) {
           		body.setVisible(true);
           	 }
        	 else if(k==3) {
            		rightArm.setVisible(true);
            	 }
        	 else if(k==2) {
         		leftArm.setVisible(true);
         	 }
        	 else if(k==1) {
          		rightLeg.setVisible(true);
          	 }
        	
         }
         else if(num==3) {
        	 int k=10-game.error;
        	 lives.setText(""+k+"");
        	 LeftLeg.setVisible(true);
        	 Main Scene=new Main();
        	 
     		try {
     		 Parent root = FXMLLoader.load(getClass().getResource("/application/lost.fxml"));
     	   	 Scene.setScene(event, root, "Game Over");
     	} catch (IOException e) {
     		e.printStackTrace();
     	}
         }
         else if (num==2) {
        	 Main Scene=new Main();
        		try {
        		 Parent root = FXMLLoader.load(getClass().getResource("/application/winner.fxml"));
        	   	 Scene.setScene(event, root, "winner");
        	} catch (IOException e) {
        		e.printStackTrace();
        	}
         }
		}
////////////////////////////////////////////////////////////////////////////////////////////	
		
		public void Quit(ActionEvent event) {
			Stage window = (Stage)(((Node) event.getSource()).getScene().getWindow());
			window.close();
		}
		public void game(ActionEvent event) {
			Main Scene=new Main();
			try {
			 Parent root = FXMLLoader.load(getClass().getResource("/application/game.fxml"));
		   	 Scene.setScene(event, root, "Game");
		   	 
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		public void back(ActionEvent event) {
			Main Scene=new Main();
			try {
			 Parent root = FXMLLoader.load(getClass().getResource("/application/menu.fxml"));
		   	 Scene.setScene(event, root,"Hangman");
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
}
