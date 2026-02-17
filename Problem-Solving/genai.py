import google.generativeai as genai

genai.configure(api_key="AIzaSyCwWMjrV93S3UbdgHrEz63Q_rGDa8u2-MU")

model = genai.GenerativeModel("gemini-1.5-flash")

response = model.generate_content(
    "Give me 5 Java String methods with one line meaning"
)
print(response.text)