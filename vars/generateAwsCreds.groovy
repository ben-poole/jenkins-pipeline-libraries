def call(mfaArn, totpKey) {
  //sh "echo 'Generating 2FA code'"
  //sh "oathtool --totp -b ${totpKey}"
  //code=`oathtool --totp -b ${totpKey}`

  echo 'Generating token'
  sh "aws sts get-session-token --serial-number ${mfaArn} --token-code `oathtool --totp -b ${totpKey}` || true" 
}