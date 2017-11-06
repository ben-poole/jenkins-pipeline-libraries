def call(mfaArn, totpKey) {
    //sh """
	    sh "echo 'Generating 2FA code'"
      sh "oathtool --totp -b ${totpKey}"
      //code=`oathtool --totp -b ${totpKey}`

      //echo 'Generating token'
      //aws sts get-session-token --serial-number ${mfaArn} --token-code $code 
	//"""
}
