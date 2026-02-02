package com.lambdaexpression.smarthomelightingautomation;

public class SmartHome {
	public static void main(String[] args) {
		LightAction motionAction = () -> System.out.println("Light On at full brightness");
		LightAction dayAction = () -> System.out.println("Light On at 30% brightness");
		LightAction voiceAction = () -> System.out.println("Change the light color form white to blue");

		motionAction.lightActivationBehavior();
		dayAction.lightActivationBehavior();
		voiceAction.lightActivationBehavior();
	}
}
